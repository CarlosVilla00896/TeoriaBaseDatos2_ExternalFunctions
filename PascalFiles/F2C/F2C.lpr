library F2C;

{$mode objfpc}{$H+}
 uses
  Classes, sysutils, Dialogs;
function F2C (var f: Double): Double ;cdecl;export;

begin
  Result:= ((f-32)/1.8);
end;

Exports
  F2C;

begin
end.

