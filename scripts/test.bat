@echo off
setlocal
rem Roda os testes, grava o relatorio e preserva o codigo de saida do Java.
cd /d "%~dp0\.." || exit /b 2

if "%ANTLR_JAR%"=="" set "ANTLR_JAR=lib\antlr-4.13.2-complete.jar"

java -Dfile.encoding=UTF-8 -cp "build\classes;%ANTLR_JAR%" sindarin.TesteRunner tests > tests\resultados.txt
set "RC=%ERRORLEVEL%"

type tests\resultados.txt
exit /b %RC%
