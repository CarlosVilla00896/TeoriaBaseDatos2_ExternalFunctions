library TRIM;

{$mode objfpc}{$H+}

uses
Classes, sysutils, Dialogs,crt,strutils;
function ib_util_malloc(l: integer): pointer; cdecl; external 'ib_util.dll';

function TRIM(const p,c: PAnsiChar): PAnsiChar; cdecl;
var
  s: string;
  ss: string;
  com: string;
  tem1: string= '';
  tem2: string= '';
  x,x2,leng1,leng2: Integer;
  begin
    s := (string(p));
    ss := (string(c));
    leng1 := Length(s);

    For x:=1 to leng1 do begin
       com:= Copy(s,x,1);
       if (com <> ss) then
       begin
            tem1 := Copy(s,x,leng1-x + 1);
            break;
       end;
    end;

    leng2 := Length(tem1);
     For x2:=leng2 downto 1 do begin
         com:= Copy(tem1,x2,1);
         if (com <> ss) then
         begin
              tem2 := Copy(tem1,1,x2);
              break;
         end;
      end;
  Result := ib_util_malloc(Length(tem2) + 1);
  StrPCopy(Result, AnsiString(tem2));
end;

Exports
  TRIM;

begin
end.

