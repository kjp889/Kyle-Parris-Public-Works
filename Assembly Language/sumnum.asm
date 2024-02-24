.MODEL SMALL

.DATA
    Input1 DB "ENTER First Number: ",'$'
    Input2 DB 10,13,"ENTER Second Number: ",'$'
    Output DB 10,13,"Sum is ",'$'
    num1 db ?
    num2 db ?
.CODE
    START:
        MOV AX, @DATA
        MOV DS, AX
        
        MOV DX, OFFSET Input1
        MOV AH, 09H
        INT 21H
        
        MOV AH, 1H
        INT 21H
        
        mov num1, al
        
        MOV DX, OFFSET Input2
        MOV AH, 09H
        INT 21H
        
        MOV AH, 1H
        INT 21H
        
        mov num2, al
        
        MOV DX, OFFSET Output
        MOV AH, 09H
        INT 21H
        
        mov ah , 00
        mov al, num1
        add al, num2
        aaa
        or ax,3030h
        
        mov bx,ax
        
        mov dl,bh
        MOV Ah, 02H
        INT 21H
        
        mov dl,bl
        MOV Ah, 02H
        INT 21H
        
        MOV AH, 04ch
        INT 21H
        
    END START