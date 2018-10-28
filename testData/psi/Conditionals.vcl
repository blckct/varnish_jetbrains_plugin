vcl 4.0;

sub vcl_if {
    if (1 == 2) {
        return (fail);
    }
}

sub vcl_else{
    if ( 1 == 2 ) {
        return (fail);
    } elseif ( 1 ==3 ){
        return (fail);
    } elsif ( 1 == 4 ){
        return (fail);
    } elif ( 1 == 5 ){
        return (fail);
    } else if ( 1 == 6 ) {
       return (fail);
    }
}