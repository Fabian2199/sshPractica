#!/bin/bash
var1="fabian"
var2="${PWD##*/}"
if [ "$var2" = "$var1" ];
then
echo "exito, el directorio es $var2 "
else
echo "error, el directorio no es $var1 es $var2"
fi

