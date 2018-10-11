
function functionGet(){
    var myRequest = new XMLHttpRequest();
    myRequest.onreadystatechange = getReadyStateHandler(myRequest);
    myRequest.open("GET", '/Home',true);
    myRequest.send(null);

}

function functionPut(){
    var myRequest = new XMLHttpRequest();
    myRequest.onreadystatechange = getReadyStateHandler(myRequest);
    myRequest.open("PUT", "/Home",true);
    myRequest.send(null);
}

function functionPost(){
    var myRequest = new XMLHttpRequest();
    myRequest.onreadystatechange = getReadyStateHandler(myRequest);
    myRequest.open("POST", "/Home",true);
    myRequest.send(null);
}

function functionDelete(){
    var myRequest = new XMLHttpRequest();
    myRequest.onreadystatechange = getReadyStateHandler(myRequest);
    myRequest.open("DELETE", "/Home",true);
    myRequest.send(null);

}

function getReadyStateHandler(xmlHttpRequest) {

    return function () {
        if (xmlHttpRequest.readyState == 4) {
            if (xmlHttpRequest.status == 200) {
                document.getElementById("conclusion").innerHTML = xmlHttpRequest.responseText;

            } else {
                alert("HTTP error " + xmlHttpRequest.status + ": " + xmlHttpRequest.statusText);
            }
        }
    }
}
