# grpc-test

FIXME: description

## Installation

Download from http://example.com/FIXME.

## Usage

FIXME: explanation

    $ java -jar grpc-test-0.1.0-standalone.jar [args]

```bash
protoc --java_out=./src/main/java ./src/main/proto/service.proto

protoc --grpc-java_out=./src/main/java --plugin=protoc-gen-grpc-java=$(which protoc-gen-grpc-java) ./src/main/proto/service.proto
```

## Options

FIXME: listing of options this app accepts.

## Examples

...

### Bugs

...

### Any Other Sections

### That You Think

### Might be Useful

## License

Copyright © 2024 FIXME

This program and the accompanying materials are made available under the
terms of the Eclipse Public License 2.0 which is available at
http://www.eclipse.org/legal/epl-2.0.

This Source Code may also be made available under the following Secondary
Licenses when the conditions for such availability set forth in the Eclipse
Public License, v. 2.0 are satisfied: GNU General Public License as published by
the Free Software Foundation, either version 2 of the License, or (at your
option) any later version, with the GNU Classpath Exception which is available
at https://www.gnu.org/software/classpath/license.html.
