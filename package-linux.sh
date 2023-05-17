#!/bin/bash -x

set -e

apt-get update && apt-get install -y binutils fakeroot libxml2-utils

APP_VERSION=$(xmllint --xpath "/*[local-name()='project']/*[local-name()='version']/text()" pom.xml)

rm -rf target/package/

jpackage \
 --type deb \
 --name "Toaster Roster" \
 --app-version ${APP_VERSION} \
 --input target/ \
 --main-jar roster-${APP_VERSION}.jar \
 --main-class com.cheng.rostergenerator.ui.Main \
 --dest target/package/ \
 --icon icon.png \
 --verbose

ls -l target/package/toaster-roster_${APP_VERSION}_*.deb
