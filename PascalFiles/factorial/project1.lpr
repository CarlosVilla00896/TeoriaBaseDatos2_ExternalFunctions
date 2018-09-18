library project1;
{$mode objfpc}{$H+}

uses
  Classes, sysutils, Dialogs,Crt;
var Contador : Integer;
var Result: Integer;
function FACTORIAL(var Value:Integer):Integer;cdecl;export;
begin
     Result:= 1;
     ClrScr;
     GotoXY( 4, 2 );

     for Contador := 1 to Value do
        begin
             Result:= Result*Contador;
        end
end;

Exports
  FACTORIAL;


begin
end.

