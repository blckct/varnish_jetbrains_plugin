vcl 4.0;

probe healthcheck {
    .request =
        "GET / HTTP/1.1"
        "Host: some-host.prod"
        "Connection: close"
        "User-Agent: varnish-probe";
}

//Modified builtin.vcl
sub vcl_synth {
    set resp.http.Content-Type =
     "text/html;" + "charset" + "=utf-8";
    set resp.http.Retry-After = "test";
    set resp.body = {"<!DOCTYPE html>
<html>
  <head>
    <title>"} + resp.status + " " + resp.reason + {"</title>
  </head>
  <body>
    <h1>Error "} + resp.status + " " + resp.reason + {"</h1>
    <p>"} + resp.reason + {"</p>
    <h3>Guru Meditation:</h3>
    <p>XID: "} + req.xid + {"</p>
    <hr>
    <p>Varnish cache server</p>
  </body>
</html>
"};
    return (deliver);
}