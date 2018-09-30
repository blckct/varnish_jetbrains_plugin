director production random {
    .retries = 2;
    { .weight  = 10; .backend  =  {.host = "0.0.0.0"; .probe = healthcheck; }}
    { .weight  = 10; .backend  =  {.host = "0.0.0.0"; .probe = healthcheck; }}
}

director name dns {
    .list = {
    .host_header = "*";
    .port = "80";
    .connect_timeout = 0.4s;
    "172.16.0.0"/24;
    }
    .ttl = 5m;
}