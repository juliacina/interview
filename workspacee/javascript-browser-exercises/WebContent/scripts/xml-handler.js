// Get the browser-specific request object, either for
// Internet Explorer 5 and 6 (top entry) or for Firefox,
// Safari, Opera, Mozilla, Netscape, or IE 7 (bottom entry).

function getRequestObject() {
  if (window.ActiveXObject) { 
    return(new ActiveXObject("Microsoft.XMLHTTP"));
  } else if (window.XMLHttpRequest) {
    return(new XMLHttpRequest());
  } else {
    return(null);
  }
}

function XmlHandler(reference, responseHandler) {
  this.reference = reference;
  this.responseHandler = responseHandler;
  
  XmlHandler.prototype.processDocument =
    function() {
      var ref = this.reference;
      var handlerFunction = this.responseHandler;
      if (ref.match(/^</)) {  // Explicit XML String
        var parser = new DOMParser();
        var xmlDocument =
          parser.parseFromString(this.reference, "application/xml");
        handlerFunction(xmlDocument);
      } else {  // URL of resource that returns XML
        var request = getRequestObject();
        request.onreadystatechange = 
          function() { XmlHandler.callHandler(request, handlerFunction); }
        request.open("GET", this.reference, true);
        request.send(null);
      }
    };
}

XmlHandler.callHandler =
  function(request, handlerFunction) {
    if ((request.readyState == 4) &&
        (request.status == 200)) {
      handlerFunction(request.responseXML);
    }
  };
  
XmlHandler.bulletedList =
  function(xmlDoc) {
    xmlDoc.documentElement.normalize();
    var list = "<ul>" +
               XmlHandler.makeList(xmlDoc.documentElement, 0) +
               "</ul>";
    return(list);
  };
  
XmlHandler.makeList =
  function(node) {
    if (node.nodeType == Node.TEXT_NODE) {
      if (node.nodeValue.match(/^\s*$/) == null) {  // Ignore whitespace         
        return("<li>" + node.nodeValue + "</li>");
      } else {
        return("");
      }
    } else if (node.nodeType == Node.ELEMENT_NODE) {
      var list = "<li>" + 
                 node.nodeName +
                 XmlHandler.attributeList(node);
      var children = node.childNodes;
      if (children.length > 0) {
        list += "\n<ul>";
        for(var i=0; i<children.length; i++) {
          list += XmlHandler.makeList(children[i]);
        }
        list += "</ul>\n";
      }
      list += "</li>\n";
      return(list);
    }
  };
  
XmlHandler.attributeList =
  function(node) {
    var list = "(";
    var attributes = node.attributes;
    for(var i=0; i<attributes.length; i++) {
      var attribute = attributes[i].nodeName;
      list += attribute +
              "=" +
              node.getAttribute(attribute);
      if (i < attributes.length-1) {
        list += ", ";
      }
    }
    list += ")";
    return(list);
  };