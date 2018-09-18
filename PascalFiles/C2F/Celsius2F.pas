library Celsius2F;

{$mode objfpc}{$H+}

uses
  Classes, Dialogs, Crt, sysutils;
function Celsius2F(var c: Double): Double; cdecl; export;
begin
    Result:= ((c*1.8)+32);
end;
Exports
  Celsius2F;

begin
end.

