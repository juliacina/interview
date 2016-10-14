function showTime() {
  ajaxResult("show-time.jsp", "time-id");
}

window.setInterval(showTime, 5000);