library BIN2DEC;

{$mode objfpc}{$H+}

uses
  Classes, sysutils,math, Dialogs, crt;

var i,longitud_binario,bit:byte;
var num_binario:string;
var acum:Double=0;

function BIN2DEC(var value : integer):Integer;cdecl;export;
begin
  num_binario:= IntToStr(value);
  longitud_binario := Length(num_binario);
  for i:=longitud_binario downto 1 do begin
    Val(num_binario[i],bit);
    acum += bit*power(2,(longitud_binario-i));
  end;
  Result:= StrToInt(FloatToStr(acum));
end;

Exports
  BIN2DEC;

begin
end.

