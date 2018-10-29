sub vcl_recv {

    if (req.request == "PURGE" ) {
      error 405 "Not allowed.";
    }

    if (req.request == "NUKE" ) {
          error 405 "Not" + " allowed.";
    }

    if (req.request == "BAN" ) {
          error 343 reason;
    }

    error 404;
}