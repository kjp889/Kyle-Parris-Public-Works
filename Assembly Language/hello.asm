.MODEL SMALL
.DATA
    strl db 10,13,"Hello, my name is Kyle", '$'
    msg db 10,13,"This is no fun", '$'
.CODE
    start:
        mov ax, @data
        mov ds, ax
        mov dx, offset strl
        mov ah, 09h
        int 21h
        mov dx, offset msg
        mov ah, 09h
        int 21h
        mov ah, 04ch
        int 21h
    end start