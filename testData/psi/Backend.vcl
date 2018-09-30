backend app0 {
        .host = "127.0.0.1";
        .port = "80";
        .connect_timeout = 10s;
        .first_byte_timeout = 600s;
        .between_bytes_timeout = 60s;
        .max_connections = 20;
}

backend app1 {
    .host = "server2.example.com";
    .probe = {
        .url = "/";
        .timeout = 1s;
        .interval = 5s;
        .window = 5;
        .threshold = 3;
    }
}