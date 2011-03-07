# clj-googl

Very basic goo.gl url shortener service API implementation.

No error handling implemented.

## Usage

    user=> (shorten "http://google.com")
    "http://goo.gl/mR2d"
    user=> (expand "http://goo.gl/mR2d")
    "http://google.com/"

## License

Copyright (C) 2010 zw0rk

Distributed under the Eclipse Public License, the same as Clojure.
