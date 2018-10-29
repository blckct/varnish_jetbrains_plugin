//Varnish 3 purge
sub vcl_hit {
        purge;
}