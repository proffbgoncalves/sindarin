@echo off
rem Uso: scripts\run.bat tokens|parse|check arquivo.sind [--lisp]
cd /d "%~dp0\.."
if "%ANTLR_JAR%"=="" set ANTLR_JAR=lib\antlr-4.13.2-complete.jar
java -Dfile.encoding=UTF-8 -cp "build\classes;%ANTLR_JAR%" sindarin.Main %*
