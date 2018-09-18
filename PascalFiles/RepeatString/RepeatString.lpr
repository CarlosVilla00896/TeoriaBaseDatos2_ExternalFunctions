library RepeatString;

{$mode objfpc}{$H+}

uses
  Classes, Dialogs,crt,strutils, sysutils;
function ib_util_malloc(l: integer): pointer; cdecl; external 'ib_util.dll';

function RepeatString(const p: PAnsiChar;var numero:integer): PAnsiChar; cdecl;
var
  str: string;
  almacenador: string= '';
  n2: string= '';
  x: Integer;
begin
  str := (string(p));
  n2 :=str;
  For x:=1 to numero do begin
      almacenador := almacenador + n2;
  end;
  Result := ib_util_malloc(Length(almacenador) + 1);
  StrPCopy(Result, AnsiString(almacenador));
end;

Exports
  RepeatString;


begin
end.

