library Compare;

{$mode objfpc}{$H+}

uses
  Classes,sysutils;
var comparador: Integer;
function Compare(const s1,s2: PAnsiChar):Integer;cdecl;export;
begin
  comparador := CompareStr(s1,s2);
  if comparador > 0 then
     begin
     Result:=1;
     end
  else if comparador <0 then
     begin
     Result:= -1;
     end
  else
  begin
      Result:= 0;
  end;
end;

  Exports
    Compare;

begin
end.

