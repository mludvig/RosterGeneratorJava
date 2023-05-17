
# Windows

jpackage --type app-image --temp "D:\all new\android\Eclipse\RosterGeneratorJava-master\temp" --name "Roster" --app-version 1.0.3 --icon "D:\all new\android\Eclipse\RosterGeneratorJava-master\icon.ico" --input "D:\all new\android\Eclipse\RosterGeneratorJava-master\jar" --main-jar RosterGenerator.jar --main-class com.cheng.rostergenerator.ui.Main


# MAC

jpackage --type app-image \

jpackage --type pkg \
 --temp ~/Downloads/temp \
 --name Roster \
 --mac-package-name "Roster @Chandler" \
 --app-version 1.0.3 \
 --input ~/Downloads/jar \
 --main-jar RosterGenerator.jar \
 --main-class com.cheng.rostergenerator.ui.Main \
 --icon "/Users/chandlercheng/Development/EclipseProjects/RosterGeneratorJava/icon.icns"

# Linux (DEB)

1. Build

    docker run --rm -it -v $(pwd):/app -w /app maven:3.8-openjdk-15 mvn clean install package

2. Package

    docker run --rm -it -v $(pwd):/app -w /app openjdk:21-slim-buster ./package-linux.sh

3. Install

    sudo dpkg -i target/package/toaster-roster_*_amd64.deb

4. Run

    /opt/toaster-roster/bin/Toaster\ Roster
