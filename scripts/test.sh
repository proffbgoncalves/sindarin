#!/usr/bin/env bash
# Roda todos os testes de tests/ e grava o relatório em tests/resultados.txt
cd "$(dirname "$0")/.."
JAR="${ANTLR_JAR:-lib/antlr-4.13.2-complete.jar}"
java -cp "build/classes:$JAR" sindarin.TesteRunner tests | tee tests/resultados.txt
exit "${PIPESTATUS[0]}"
