# boot-actuator-demo

[![Build Status](https://travis-ci.org/briansjavablog/spring-boot-actuator-demo.svg?branch=master)](https://travis-ci.org/briansjavablog/spring-boot-actuator-demo))
Demo app uses an existing REST API app to demo Spring Boots Actuator endpoints.

## Running
On the command line run mvn spring-boot:run

## Endpoint Security
There are a number of properties in application.properties for configuring endpoint security

## Health Endpoint
On the command line run curl --user user:password localhost:8080/health

## Info Endpoint
On the command line run curl --user user:password localhost:8080/info

## Metrics Endpoint
On the command line run curl --user user:password localhost:8080/metrics

## Env Endpoint
On the command line run curl --user user:password localhost:8080/env

## Loggers Endpoint
On the command line run curl --user user:password localhost:8080/loggers

## HeapDump Endpoint
On the command line run curl --user user:password localhost:8080/heapdump >> heapdump.hprof






