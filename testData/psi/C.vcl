#Example taken from: https://varnish-cache.org/docs/trunk/users-guide/vcl-inline-c.html
vcl 4.0;

C{
        #include <syslog.h>
}C

sub vcl_something {

        C{
                syslog(LOG_INFO, "Something happened at VCL line XX.");
        }C
}