vcl 4.1;

sub vcl_init {
    new bar = directors.round_robin();
}