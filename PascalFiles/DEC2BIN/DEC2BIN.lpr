library DEC2BIN;

{$mode objfpc}{$H+}
uses
  Classes,Dialogs,crt,strutils, sysutils;


var cadena:String = '';
temporal :String= '';
var r,numero_divido,i: integer;
var st:String = '';


function DEC2BIN(var numero :integer ):integer;cdecl;export;

begin
  while numero > 0 do
    begin
      numero_divido:= numero mod 2;
      numero := numero div 2;
      temporal := IntToStr(numero_divido);
      st := st + temporal;
    end;
  for i:=0 to (Length(st)-1)do
  begin
    cadena += Copy(st,Length(st)-i,1);
  end;
  r:= StrToInt(cadena);
  Result:=r;
  end;

Exports
  DEC2BIN;


begin
end.

