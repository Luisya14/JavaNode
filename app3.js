var net = require('net');
var send = require('./SocketLocal');
var fs = require('fs');

var HOST = 'localhost'; // parameterize the IP of the Listen
var PORT = 8080; // TCP LISTEN port

net.createServer(function(sock) {
  sock.setEncoding('utf8');
  console.log('CONNECTED: ' + sock.remoteAddress +':'+ sock.remotePort);

  sock.on('data', function(data) {
    sock.write(data,function(err){
      send(data);
      sock.end();
    });

    console.log("Message received: "+data.toString());
  });

  sock.on('close', function(data) {
	  console.log('CLOSED: ' + sock.remoteAddress +' '+ sock.remotePort);
  });
}).listen(PORT, HOST);


console.log('Server listening on ' + HOST +':'+ PORT);
