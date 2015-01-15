declare i32 @printInt(i32)
declare i32 @printFloat(float)
declare i32 @printChar(i8)
declare i32 @printString(i32*)
declare i32 @readInt()
declare float @readFloat()
declare i8 @readChar()
declare i32 @iexp(i32, i32)
declare float @fexp(float, float)
declare i32 @floatToInt(float)
declare float @intToFloat(i32)
declare i32* @createIntArray(i32)
declare void @setArrayItemInt(i32*, i32, i32)
declare i32 @getArrayItemInt(i32*, i32)
declare i32* @createFloatArray(i32)
declare void @setArrayItemFloat(i32*, i32, float)
declare float @getArrayItemFloat(i32*, i32)
declare i32* @createCharArray(i32)
declare void @setArrayItemChar(i32*, i32, i8)
declare i8 @getArrayItemChar(i32*, i32)
declare i32* @createArrayType(i32)
declare void @setArrayItemType(i32*, i32, i32*)
declare i32* @getArrayItemType(i32*, i32)
declare i32 @sizeArrayInt(i32*)
declare i32 @sizeArrayFloat(i32*)
declare i32 @sizeArrayChar(i32*)
declare i32 @sizeArrayType(i32*)
define i32 @main() {
start:
%R0 = alloca i32
%R1 = call i32 @readInt()
store i32 %R1, i32* %R0
%R2 = alloca i32
%R3 = call i32 @readInt()
store i32 %R3, i32* %R2
%R8 = load i32* %R0
%R9 = call i32* @createArrayType(i32 %R8)
%R10 = alloca i32
store i32 0, i32* %R10
br label %L0
L0:
%R11 = load i32* %R10
%R12 = icmp slt i32 %R11, %R8
br i1 %R12, label %L1, label %L2
L1:
%R5 = alloca i32*
%R6 = load i32* %R0
%R7 = call i32* @createIntArray(i32 %R6)
store i32* %R7, i32** %R5
%R13 = load i32* %R10
call void @setArrayItemType(i32* %R9, i32 %R13, i32* %R7)
br label %L3
L3:
%R14 = load i32* %R10
%R15 = add i32 %R14, 1
store i32 %R15, i32* %R10
br label %L0
L2:
store i32* %R9, i32** %R5
%R18 = add i32 0, 0
%R17 = alloca i32
store i32 %R18, i32* %R17
br label %L10
L10:
%R19 = load i32* %R0
%R37 = load i32* %R17
%R38 = icmp slt i32 %R37, %R19
br i1 %R38, label %L11, label %L5
L11:
%R21 = add i32 0, 0
%R20 = alloca i32
store i32 %R21, i32* %R20
br label %L8
L8:
%R22 = load i32* %R0
%R31 = load i32* %R20
%R32 = icmp slt i32 %R31, %R22
br i1 %R32, label %L9, label %L7
L9:
%R23 = load i32** %R5
%R25 = add i32 0, 0
%R26 = load i32* %R20
%R24 = call i32* @getArrayItemType(i32* %R23, i32 %R26)
%R28 = load i32* %R17
call void @setArrayItemInt(i32* %R24, i32 %R28, i32 %R25)
br label %L6
L6:
%R29 = load i32* %R20
%R30 = add i32 %R29, 1
%R33 = add i32 %R30, 0
store i32 %R33, i32* %R20
br label %L8
L7:
%R34 = add i32 0, 0
br label %L4
L4:
%R35 = load i32* %R17
%R36 = add i32 %R35, 1
%R39 = add i32 %R36, 0
store i32 %R39, i32* %R17
br label %L10
L5:
%R40 = add i32 0, 0
%R41 = alloca i32
%R42 = alloca i32
%R44 = add i32 0, 0
%R43 = alloca i32
store i32 %R44, i32* %R43
br label %L14
L14:
%R45 = load i32* %R2
%R62 = load i32* %R43
%R63 = icmp slt i32 %R62, %R45
br i1 %R63, label %L15, label %L13
L15:
%R46 = call i32 @readInt()
store i32 %R46, i32* %R41
%R47 = call i32 @readInt()
store i32 %R47, i32* %R42
%R48 = load i32** %R5
%R50 = add i32 0, 1
%R51 = load i32* %R42
%R49 = call i32* @getArrayItemType(i32* %R48, i32 %R51)
%R53 = load i32* %R41
call void @setArrayItemInt(i32* %R49, i32 %R53, i32 %R50)
%R54 = load i32** %R5
%R56 = add i32 0, 1
%R57 = load i32* %R41
%R55 = call i32* @getArrayItemType(i32* %R54, i32 %R57)
%R59 = load i32* %R42
call void @setArrayItemInt(i32* %R55, i32 %R59, i32 %R56)
br label %L12
L12:
%R60 = load i32* %R43
%R61 = add i32 %R60, 1
%R64 = add i32 %R61, 0
store i32 %R64, i32* %R43
br label %L14
L13:
%R65 = add i32 0, 0
%R67 = alloca i32*
%R68 = load i32* %R0
%R69 = call i32* @createIntArray(i32 %R68)
store i32* %R69, i32** %R67
%R71 = add i32 0, 0
%R70 = alloca i32
store i32 %R71, i32* %R70
br label %L18
L18:
%R72 = load i32* %R0
%R79 = load i32* %R70
%R80 = icmp slt i32 %R79, %R72
br i1 %R80, label %L19, label %L17
L19:
%R73 = load i32** %R67
%R75 = add i32 0, 0
%R76 = load i32* %R70
call void @setArrayItemInt(i32* %R73, i32 %R76, i32 %R75)
br label %L16
L16:
%R77 = load i32* %R70
%R78 = add i32 %R77, 1
%R81 = add i32 %R78, 0
store i32 %R81, i32* %R70
br label %L18
L17:
%R82 = add i32 0, 0
%R83 = load i32** %R67
%R85 = add i32 0, 1
%R86 = add i32 0, 0
call void @setArrayItemInt(i32* %R83, i32 %R86, i32 %R85)
%R87 = alloca i1
%R88 = add i1 0, 1
store i1 %R88, i1* %R87
br label %L20
L20:
%R89 = load i1* %R87
%R140 = icmp ne i1 %R89, 0
br i1 %R140, label %L39, label %L21
L39:
%R90 = add i1 0, 0
store i1 %R90, i1* %R87
%R92 = add i32 0, 0
%R91 = alloca i32
store i32 %R92, i32* %R91
br label %L37
L37:
%R93 = load i32* %R0
%R136 = load i32* %R91
%R137 = icmp slt i32 %R136, %R93
br i1 %R137, label %L38, label %L23
L38:
%R94 = load i32** %R67
%R96 = load i32* %R91
%R95 = call i32 @getArrayItemInt(i32* %R94, i32 %R96)
%R98 = add i32 0, 1
%R99 = icmp eq i32 %R95, %R98
br i1 %R99, label %L35, label %L36
L35:
%R101 = add i32 0, 0
%R100 = alloca i32
store i32 %R101, i32* %R100
br label %L33
L33:
%R102 = load i32* %R0
%R128 = load i32* %R100
%R129 = icmp slt i32 %R128, %R102
br i1 %R129, label %L34, label %L26
L34:
%R103 = load i32** %R5
%R105 = load i32* %R100
%R104 = call i32* @getArrayItemType(i32* %R103, i32 %R105)
%R107 = load i32* %R91
%R106 = call i32 @getArrayItemInt(i32* %R104, i32 %R107)
%R109 = add i32 0, 1
%R110 = icmp eq i32 %R106, %R109
br i1 %R110, label %L31, label %L32
L31:
%R111 = load i32** %R67
%R113 = load i32* %R100
%R112 = call i32 @getArrayItemInt(i32* %R111, i32 %R113)
%R115 = add i32 0, 0
%R116 = icmp eq i32 %R112, %R115
br i1 %R116, label %L29, label %L30
L29:
%R117 = load i32** %R67
%R119 = add i32 0, 1
%R120 = load i32* %R100
call void @setArrayItemInt(i32* %R117, i32 %R120, i32 %R119)
%R121 = add i1 0, 1
store i1 %R121, i1* %R87
br label %L28
L30:
br label %L28
L28:
%R123 = add i32 0, 0
br label %L27
L32:
br label %L27
L27:
%R125 = add i32 0, 0
br label %L25
L25:
%R126 = load i32* %R100
%R127 = add i32 %R126, 1
%R130 = add i32 %R127, 0
store i32 %R130, i32* %R100
br label %L33
L26:
%R131 = add i32 0, 0
br label %L24
L36:
br label %L24
L24:
%R133 = add i32 0, 0
br label %L22
L22:
%R134 = load i32* %R91
%R135 = add i32 %R134, 1
%R138 = add i32 %R135, 0
store i32 %R138, i32* %R91
br label %L37
L23:
%R139 = add i32 0, 0
br label %L20
L21:
%R141 = add i32 0, 0
%R142 = alloca i1
%R143 = add i1 0, 1
store i1 %R143, i1* %R142
%R145 = add i32 0, 0
%R144 = alloca i32
store i32 %R145, i32* %R144
br label %L45
L45:
%R146 = load i32* %R0
%R158 = load i32* %R144
%R159 = icmp slt i32 %R158, %R146
br i1 %R159, label %L46, label %L41
L46:
%R147 = load i32** %R67
%R149 = load i32* %R144
%R148 = call i32 @getArrayItemInt(i32* %R147, i32 %R149)
%R151 = add i32 0, 0
%R152 = icmp eq i32 %R148, %R151
br i1 %R152, label %L43, label %L44
L43:
%R153 = add i1 0, 0
store i1 %R153, i1* %R142
br label %L42
L44:
br label %L42
L42:
%R155 = add i32 0, 0
br label %L40
L40:
%R156 = load i32* %R144
%R157 = add i32 %R156, 1
%R160 = add i32 %R157, 0
store i32 %R160, i32* %R144
br label %L45
L41:
%R161 = add i32 0, 0
%R162 = load i1* %R142
br i1 %R162, label %L48, label %L49
L48:
%R163 = add i32 0, 4
%R164 = call i32* @createCharArray(i32 %R163)
%R165 = add i32 0, 0
%R166 = add i32 1, %R165
%R167 = add i8 0, 89
call void @setArrayItemChar(i32* %R164, i32 %R166, i8 %R167)
%R168 = add i32 1, %R166
%R169 = add i8 0, 69
call void @setArrayItemChar(i32* %R164, i32 %R168, i8 %R169)
%R170 = add i32 1, %R168
%R171 = add i8 0, 83
call void @setArrayItemChar(i32* %R164, i32 %R170, i8 %R171)
%R172 = add i32 1, %R170
%R173 = add i8 0, 34
call void @setArrayItemChar(i32* %R164, i32 %R172, i8 %R173)
%R174 = call i32 @printString(i32* %R164)
br label %L47
L49:
%R176 = add i32 0, 3
%R177 = call i32* @createCharArray(i32 %R176)
%R178 = add i32 0, 0
%R179 = add i32 1, %R178
%R180 = add i8 0, 78
call void @setArrayItemChar(i32* %R177, i32 %R179, i8 %R180)
%R181 = add i32 1, %R179
%R182 = add i8 0, 79
call void @setArrayItemChar(i32* %R177, i32 %R181, i8 %R182)
%R183 = add i32 1, %R181
%R184 = add i8 0, 34
call void @setArrayItemChar(i32* %R177, i32 %R183, i8 %R184)
%R185 = call i32 @printString(i32* %R177)
br label %L47
br label %L47
L47:
%R186 = add i32 0, 0
ret i32 0
}
