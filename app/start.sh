#!/bin/bash

## Java 8 ou inferior
#java -jar -Xms128M -Xmx128M -XX:PermSize=64m -XX:MaxPermSize=128m -Dspring.profiles.active=prod target/forum.jar

## A partir do Java 9
java -jar -Xms128M -Xmx128M -Dspring.profiles.active=prod target/forum.jar