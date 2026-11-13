@echo off
rem Requer JDK 17+ no PATH. Baixa o ANTLR 4.13.2 na primeira vez (curl existe no Windows 10+).
cd /d "%~dp0\.."
set ANTLR_VERSION=4.13.2
if "%ANTLR_JAR%"=="" set ANTLR_JAR=lib\antlr-%ANTLR_VERSION%-complete.jar
if not exist "%ANTLR_JAR%" (
  if not exist lib mkdir lib
  curl -fL -o "%ANTLR_JAR%" https://www.antlr.org/download/antlr-%ANTLR_VERSION%-complete.jar || exit /b 1
)
if exist build rmdir /s /q build
mkdir build\gen\sindarin\gen
mkdir build\classes
java -jar "%ANTLR_JAR%" -Dlanguage=Java -encoding UTF-8 -package sindarin.gen -visitor -no-listener -Xexact-output-dir -o build\gen\sindarin\gen grammar\SindarinLexer.g4 grammar\SindarinParser.g4 || exit /b 1
javac -encoding UTF-8 -cp "%ANTLR_JAR%" -d build\classes build\gen\sindarin\gen\*.java src\sindarin\*.java || exit /b 1
echo Build OK
