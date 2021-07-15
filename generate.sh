#!/usr/bin/env sh

protoc -I=./src/main/proto --java_out=./src/main/java course.proto
