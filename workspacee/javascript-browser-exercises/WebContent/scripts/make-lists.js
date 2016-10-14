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

function showList1(xmlString, outputRegion) {
  var handlerFunction = 
    function(xmlDoc) {
      var list = XmlHandler.bulletedList(xmlDoc);
      htmlInsert(outputRegion, list);
    };
  var handler = 
    new XmlHandler(xmlString, handlerFunction);
  handler.processDocument();
}

function showList2(textArea, outputRegion) {
  var xmlString = document.getElementById(textArea).value;
  showList1(xmlString, outputRegion);
}

// Insert the html data into the element that has the specified id.

function htmlInsert(id, htmlData) {
  document.getElementById(id).innerHTML = htmlData;
}