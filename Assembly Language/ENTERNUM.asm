;Write an Assembly language program to accept a single character from the user and output it to the screen. 
;Use appropriate prompts for input and output messages. 
;HINT: You will need to use the appropriate subroutine/interrupt.

.MODEL SMALL

.DATA
    CHAR DB "ENTER A CHARACTER: ",'$'
    OUTPUT DB 10,13,"YOUR CHARACTER IS: ",'$'
.CODE
    START:
        MOV AX, @DATA
        MOV DS, AX
        MOV DX, OFFSET CHAR
        MOV AH, 09H
        INT 21H
        
        MOV AH, 1H
        INT 21H
        
        MOV DX, OFFSET OUTPUT
        MOV AH, 09H
        INT 21H
        
        MOV DL, AL
        MOV AH, 02H
        INT 21H
        
        MOV AH, 04ch
        INT 21H
        
    END START