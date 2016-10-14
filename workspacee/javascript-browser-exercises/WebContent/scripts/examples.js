var test1 =
  "<customers rating='vip'>" +
    "<customer id='a1234' rank='2'>" +
      "<firstName>Rafael</firstName>" +
      "<lastName>Nadal</lastName>" +
    "</customer>" +
    "<customer id='a1235'  rank='1'>" +
      "<firstName>Roger</firstName>" +
      "<lastName>Federer</lastName>" +
    "</customer>" +
  "</customers>";

var test2 = '<foo><bar a="1" b="2"><baz c="3">Hello</baz><baz/></bar></foo>';

function getXmlDoc(xmlString) {
  var parser = new DOMParser();
  var xmlDocument =
    parser.parseFromString(xmlString, "application/xml");
  return(xmlDocument);
}

function showMainElementName(xmlString) {
  var xmlDoc = getXmlDoc(xmlString);
  console.log("Node name: %s", xmlDoc.documentElement.nodeName);
}

function showMainElementInfo(xmlString) {
  var xmlDoc = getXmlDoc(xmlString);
  console.log("Node name: %s %s", 
              xmlDoc.documentElement.nodeName,
              attributeList(xmlDoc.documentElement));
}

function attributeList(node) {
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
}