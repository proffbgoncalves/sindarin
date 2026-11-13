#!/usr/bin/env bash
# Uso: ./scripts/run.sh tokens|parse|check arquivo.sind [--lisp]
cd "$(dirname "$0")/.."
JAR="${ANTLR_JAR:-lib/antlr-4.13.2-complete.jar}"
exec java -cp "build/classes:$JAR" sindarin.Main "$@"
