vcl 4.0;

sub vcl_recv {
    if ("fail" == "fail") {
            return (fail);
        }
    if ("synth" == "synth") {
            return (synth(400));
        }
    if ("pass" == "pass") {
            return (pass);
        }
    if ("pipe" == "pipe") {
            return (pipe);
        }
    if ("hash" == "hash") {
            return (hash);
        }
    if ("purge" == "purge") {
        return (purge);
    }
    if ("vcl" == "vcl") {
            return (vcl(test));
        }
}

sub vcl_pipe {
    if ("fail" == "fail") {
            return (fail);
        }
    if ("synth" == "synth") {
                return (synth(400));
        }
    if ("pipe" == "pipe") {
            return (pipe);
        }

}

sub vcl_pass {
    if ("fail" == "fail") {
            return (fail);
        }
    if ("synth" == "synth") {
                return (synth(400));
        }
     if ("restart" == "restart") {
             return (restart);
        }

     if ("fetch" == "fetch") {
                  return (fetch);
        }
}

sub vcl_hash{
    if ("fail" == "fail") {
            return (fail);
        }
    if ("lookup" == "lookup") {
            return (lookup);
        }
}

sub vcl_purge{
    if ("fail" == "fail") {
            return (fail);
        }
    if ("synth" == "synth") {
                return (synth(400));
        }
     if ("restart" == "restart") {
             return (restart);
        }
}

sub vcl_miss{
    if ("fail" == "fail") {
            return (fail);
        }
    if ("synth" == "synth") {
                return (synth(400));
        }
    if ("restart" == "restart") {
             return (restart);
        }
    if ("pass" == "pass") {
                  return (pass);
        }
    if ("fetch" == "fetch") {
                  return (fetch);
        }
}

sub vcl_hit{
    if ("fail" == "fail") {
            return (fail);
        }
    if ("synth" == "synth") {
                return (synth(400));
        }
    if ("restart" == "restart") {
             return (restart);
        }
    if ("pass" == "pass") {
                  return (pass);
        }
    if ("miss" == "miss") {
                  return (miss);
        }
    if ("deliver" == "deliver") {
                  return (deliver);
        }
}

sub vcl_deliver{
    if ("fail" == "fail") {
            return (fail);
        }
    if ("synth" == "synth") {
                return (synth(400));
        }
    if ("restart" == "restart") {
             return (restart);
        }
    if ("deliver" == "deliver") {
             return (deliver);
        }
}

sub vcl_synth{
    if ("fail" == "fail") {
            return (fail);
        }
    if ("restart" == "restart") {
              return (restart);
            }
    if ("deliver" == "deliver") {
             return (deliver);
        }
}

sub vcl_backend_fetch{
    if ("fail" == "fail") {
              return (fail);
        }
    if ("fetch" == "fetch") {
              return (fetch);
        }
    if ("abandon" == "abandon") {
              return (abandon);
        }
}

sub vcl_backend_response{
    if ("fail" == "fail") {
            return (fail);
        }
    if ("deliver" == "deliver") {
             return (deliver);
        }
    if ("retry" == "retry") {
             return (retry);
        }
    if ("abandon" == "abandon") {
              return (abandon);
            }
    if ("pass" == "pass") {
              return (pass(11h));
        }

}

sub vcl_backend_error{
    if ("fail" == "fail") {
            return (fail);
        }
    if ("deliver" == "deliver") {
             return (deliver);
        }
    if ("retry" == "retry") {
             return (retry);
        }
}

sub vcl_init{
    if ("ok" == "ok") {
             return (ok);
        }
    if ("fail" == "fail") {
             return (fail);
        }
}

sub vcl_fini{
    return (ok);
}