library Repeat;

{$mode objfpc}{$H+}


uses
  Classes, sysutils, Dialogs,crt,strutils;
function ib_util_malloc(l: integer): pointer; cdecl; external 'ib_util.dll';

function Repeat(const p: PAnsiChar;var numero:integer): PAnsiChar; cdecl;
var
  s: string;
  n: string= '';
  n2: string= '';
  x: Integer;
begin
  s := (string(p));
  n2 :=s;
  For x:=1 to numero do begin
      n := n + n2;
  end;
  Result := ib_util_malloc(Length(n) + 1);
  StrPCopy(Result, AnsiString(n));
end;

Exports
  Repeat;

begin
end.

