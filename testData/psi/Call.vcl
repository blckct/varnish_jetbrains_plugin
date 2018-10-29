vcl 4.0;

sub vcl_recv {
  call always_pipe;
}

sub always_pipe {
    return (pipe);
}