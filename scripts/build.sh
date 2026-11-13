#!/usr/bin/env bash
# Gera o lexer/parser com o ANTLR 4.13.2 e compila tudo. Requer JDK 17+ (javac) e internet
# apenas na primeira vez (para baixar o jar do ANTLR). Para usar um jar que você já tem:
#   ANTLR_JAR=/caminho/antlr-4.13.2-complete.jar ./scripts/build.sh
set -euo pipefail
cd "$(dirname "$0")/.."
ANTLR_VERSION=4.13.2
JAR="${ANTLR_JAR:-lib/antlr-$ANTLR_VERSION-complete.jar}"
if [ ! -f "$JAR" ]; then
  mkdir -p lib
  echo "Baixando ANTLR $ANTLR_VERSION..."
  curl -fL -o "$JAR" "https://www.antlr.org/download/antlr-$ANTLR_VERSION-complete.jar"
fi
rm -rf build
mkdir -p build/gen/sindarin/gen build/classes
java -jar "$JAR" -Dlanguage=Java -encoding UTF-8 -package sindarin.gen -visitor -no-listener \
     -Xexact-output-dir -o build/gen/sindarin/gen grammar/SindarinLexer.g4 grammar/SindarinParser.g4
javac -encoding UTF-8 -cp "$JAR" -d build/classes build/gen/sindarin/gen/*.java src/sindarin/*.java
echo "Build OK -> build/classes"
