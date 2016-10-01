
module.exports = function(obj){
var net = require('net');


var HOST = 'localhost'; // parameterize the IP of the Listen
var PORT = 4444; // TCP LISTEN port

var client = new net.Socket;

client.connect(4444,'localhost',function(){
  console.log("Connected");
  client.write(obj);
  console.log("Sended");
  client.destroy();
});

}
