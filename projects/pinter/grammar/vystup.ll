declare void @arrcopy(i32*,i32*,i32)
declare i32 @readInt()
declare void @readString(i32*,i32)
declare void @printInt(i32)
declare void @printString(i32*,i32)
declare void @printIntSep(i32,i32*,i32)
declare void @printStringSep(i32*,i32,i32*,i32)
declare void @printLine()
define i32 @union(i32 %R109, i32 %R114, i32 %R119, i32 %R124, i32* %R136, i32* %R146) {
start:
%R108 = alloca i32
store i32 0, i32* %R108
%R107 = load i32* %R108
store i32 %R109, i32* %R108
%R113 = alloca i32
store i32 0, i32* %R113
%R112 = load i32* %R113
store i32 %R114, i32* %R113
%R118 = alloca i32
store i32 0, i32* %R118
%R117 = load i32* %R118
store i32 %R119, i32* %R118
%R123 = alloca i32
store i32 0, i32* %R123
%R122 = load i32* %R123
store i32 %R124, i32* %R123
%R128 = alloca i32, i32 1
%R129 = alloca i32
store i32 0, i32* %R129
%R130 = alloca i32
store i32 1, i32* %R130
%R131 = load i32* %R118
%R132 = getelementptr i32* %R128, i32 0
store i32 %R131, i32* %R132
%R133 = load i32* %R130
%R134 = mul i32 %R133, %R131
store i32 %R134, i32* %R130
%R135 = load i32* %R130
%R127 = alloca i32, i32 %R135
%R138 = alloca i32, i32 1
%R139 = alloca i32
store i32 0, i32* %R139
%R140 = alloca i32
store i32 1, i32* %R140
%R141 = load i32* %R118
%R142 = getelementptr i32* %R138, i32 0
store i32 %R141, i32* %R142
%R143 = load i32* %R140
%R144 = mul i32 %R143, %R141
store i32 %R144, i32* %R140
%R145 = load i32* %R140
%R137 = alloca i32, i32 %R145
%R148 = alloca i32
store i32 0, i32* %R148
%R147 = load i32* %R148
%R149 = load i32* %R113
%R150 = load i32* %R118
%R151 = load i32* %R123
%R152 = alloca i32
%R153 = load i32* %R130
store i32 %R153, i32* %R152
%R154 = alloca i32
store i32 0, i32* %R154
%R155 = alloca i32
%R156 = load i32* %R140
store i32 %R156, i32* %R155
%R157 = alloca i32
store i32 0, i32* %R157
%R158 = call i32 @find(i32 %R149, i32 %R150, i32 %R151, i32* %R136, i32* %R146)
store i32 %R158, i32* %R148
%R162 = alloca i32
store i32 0, i32* %R162
%R161 = load i32* %R162
%R163 = load i32* %R108
%R164 = load i32* %R118
%R165 = load i32* %R123
%R166 = alloca i32
%R167 = load i32* %R130
store i32 %R167, i32* %R166
%R168 = alloca i32
store i32 0, i32* %R168
%R169 = alloca i32
%R170 = load i32* %R140
store i32 %R170, i32* %R169
%R171 = alloca i32
store i32 0, i32* %R171
%R172 = call i32 @find(i32 %R163, i32 %R164, i32 %R165, i32* %R136, i32* %R146)
store i32 %R172, i32* %R162
%R175 = alloca i32
%R176 = load i32* %R140
store i32 %R176, i32* %R175
%R177 = alloca i32
store i32 0, i32* %R177
%R178 = load i32* %R162
%R179 = getelementptr i32* %R138, i32 0
%R183 = load i32* %R179
%R180 = add i32 0, %R178
%R181 = load i32* %R177
%R182 = add i32 %R181, %R180
store i32 %R182, i32* %R177
%R184 = load i32* %R175
%R185 = sdiv i32 %R184, %R183
store i32 %R185, i32* %R175
%R198 = load i32* %R177
%R197 = getelementptr i32* %R146, i32 %R198
%R199 = load i32* %R197
%R186 = alloca i32
%R187 = load i32* %R140
store i32 %R187, i32* %R186
%R188 = alloca i32
store i32 0, i32* %R188
%R189 = load i32* %R148
%R190 = getelementptr i32* %R138, i32 0
%R194 = load i32* %R190
%R191 = add i32 0, %R189
%R192 = load i32* %R188
%R193 = add i32 %R192, %R191
store i32 %R193, i32* %R188
%R195 = load i32* %R186
%R196 = sdiv i32 %R195, %R194
store i32 %R196, i32* %R186
%R201 = load i32* %R188
%R200 = getelementptr i32* %R146, i32 %R201
%R202 = load i32* %R200
%R203 = icmp slt i32 %R199, %R202
%R204 = sext i1 %R203 to i32
%R238 = icmp ne i32 %R204, 0
br i1 %R238, label %L3, label %L4
L3:
%R205 = alloca i32
%R206 = load i32* %R130
store i32 %R206, i32* %R205
%R207 = alloca i32
store i32 0, i32* %R207
%R208 = load i32* %R162
%R209 = getelementptr i32* %R128, i32 0
%R213 = load i32* %R209
%R210 = add i32 0, %R208
%R211 = load i32* %R207
%R212 = add i32 %R211, %R210
store i32 %R212, i32* %R207
%R214 = load i32* %R205
%R215 = sdiv i32 %R214, %R213
store i32 %R215, i32* %R205
%R216 = load i32* %R148
%R220 = load i32* %R207
%R219 = getelementptr i32* %R136, i32 %R220
store i32 %R216, i32* %R219
br label %L5
L4:
%R222 = alloca i32
%R223 = load i32* %R130
store i32 %R223, i32* %R222
%R224 = alloca i32
store i32 0, i32* %R224
%R225 = load i32* %R148
%R226 = getelementptr i32* %R128, i32 0
%R230 = load i32* %R226
%R227 = add i32 0, %R225
%R228 = load i32* %R224
%R229 = add i32 %R228, %R227
store i32 %R229, i32* %R224
%R231 = load i32* %R222
%R232 = sdiv i32 %R231, %R230
store i32 %R232, i32* %R222
%R233 = load i32* %R162
%R237 = load i32* %R224
%R236 = getelementptr i32* %R136, i32 %R237
store i32 %R233, i32* %R236
br label %L5
L5:
%R221 = add i32 0, 0
ret i32 0
}
define i32 @find(i32 %R2, i32 %R7, i32 %R12, i32* %R24, i32* %R34) {
start:
%R1 = alloca i32
store i32 0, i32* %R1
%R0 = load i32* %R1
store i32 %R2, i32* %R1
%R6 = alloca i32
store i32 0, i32* %R6
%R5 = load i32* %R6
store i32 %R7, i32* %R6
%R11 = alloca i32
store i32 0, i32* %R11
%R10 = load i32* %R11
store i32 %R12, i32* %R11
%R16 = alloca i32, i32 1
%R17 = alloca i32
store i32 0, i32* %R17
%R18 = alloca i32
store i32 1, i32* %R18
%R19 = load i32* %R6
%R20 = getelementptr i32* %R16, i32 0
store i32 %R19, i32* %R20
%R21 = load i32* %R18
%R22 = mul i32 %R21, %R19
store i32 %R22, i32* %R18
%R23 = load i32* %R18
%R15 = alloca i32, i32 %R23
%R26 = alloca i32, i32 1
%R27 = alloca i32
store i32 0, i32* %R27
%R28 = alloca i32
store i32 1, i32* %R28
%R29 = load i32* %R6
%R30 = getelementptr i32* %R26, i32 0
store i32 %R29, i32* %R30
%R31 = load i32* %R28
%R32 = mul i32 %R31, %R29
store i32 %R32, i32* %R28
%R33 = load i32* %R28
%R25 = alloca i32, i32 %R33
%R35 = alloca i32
%R36 = load i32* %R18
store i32 %R36, i32* %R35
%R37 = alloca i32
store i32 0, i32* %R37
%R38 = load i32* %R1
%R39 = getelementptr i32* %R16, i32 0
%R43 = load i32* %R39
%R40 = add i32 0, %R38
%R41 = load i32* %R37
%R42 = add i32 %R41, %R40
store i32 %R42, i32* %R37
%R44 = load i32* %R35
%R45 = sdiv i32 %R44, %R43
store i32 %R45, i32* %R35
%R48 = load i32* %R37
%R47 = getelementptr i32* %R24, i32 %R48
%R49 = load i32* %R47
%R46 = load i32* %R1
%R50 = icmp eq i32 %R49, %R46
%R51 = sext i1 %R50 to i32
%R106 = icmp ne i32 %R51, 0
br i1 %R106, label %L0, label %L1
L0:
%R52 = load i32* %R1
ret i32 %R52
br label %L2
L1:
%R54 = alloca i32
%R55 = load i32* %R18
store i32 %R55, i32* %R54
%R56 = alloca i32
store i32 0, i32* %R56
%R57 = load i32* %R1
%R58 = getelementptr i32* %R16, i32 0
%R62 = load i32* %R58
%R59 = add i32 0, %R57
%R60 = load i32* %R56
%R61 = add i32 %R60, %R59
store i32 %R61, i32* %R56
%R63 = load i32* %R54
%R64 = sdiv i32 %R63, %R62
store i32 %R64, i32* %R54
%R65 = alloca i32
%R66 = load i32* %R18
store i32 %R66, i32* %R65
%R67 = alloca i32
store i32 0, i32* %R67
%R68 = load i32* %R1
%R69 = getelementptr i32* %R16, i32 0
%R73 = load i32* %R69
%R70 = add i32 0, %R68
%R71 = load i32* %R67
%R72 = add i32 %R71, %R70
store i32 %R72, i32* %R67
%R74 = load i32* %R65
%R75 = sdiv i32 %R74, %R73
store i32 %R75, i32* %R65
%R77 = load i32* %R67
%R76 = getelementptr i32* %R24, i32 %R77
%R78 = load i32* %R76
%R79 = load i32* %R6
%R80 = load i32* %R11
%R81 = alloca i32
%R82 = load i32* %R18
store i32 %R82, i32* %R81
%R83 = alloca i32
store i32 0, i32* %R83
%R84 = alloca i32
%R85 = load i32* %R28
store i32 %R85, i32* %R84
%R86 = alloca i32
store i32 0, i32* %R86
%R87 = call i32 @find(i32 %R78, i32 %R79, i32 %R80, i32* %R24, i32* %R34)
%R91 = load i32* %R56
%R90 = getelementptr i32* %R24, i32 %R91
store i32 %R87, i32* %R90
%R92 = alloca i32
%R93 = load i32* %R18
store i32 %R93, i32* %R92
%R94 = alloca i32
store i32 0, i32* %R94
%R95 = load i32* %R1
%R96 = getelementptr i32* %R16, i32 0
%R100 = load i32* %R96
%R97 = add i32 0, %R95
%R98 = load i32* %R94
%R99 = add i32 %R98, %R97
store i32 %R99, i32* %R94
%R101 = load i32* %R92
%R102 = sdiv i32 %R101, %R100
store i32 %R102, i32* %R92
%R104 = load i32* %R94
%R103 = getelementptr i32* %R24, i32 %R104
%R105 = load i32* %R103
ret i32 %R105
br label %L2
L2:
%R53 = add i32 0, 0
ret i32 0
}
define i32 @main() {
start:
%R240 = alloca i32
store i32 0, i32* %R240
%R239 = load i32* %R240
%R241 = call i32 @readInt()
store i32 %R241, i32* %R240
%R244 = alloca i32
store i32 0, i32* %R244
%R243 = load i32* %R244
%R245 = call i32 @readInt()
store i32 %R245, i32* %R244
%R248 = alloca i32, i32 1
%R249 = alloca i32
store i32 0, i32* %R249
%R250 = alloca i32
store i32 1, i32* %R250
%R251 = load i32* %R240
%R252 = getelementptr i32* %R248, i32 0
store i32 %R251, i32* %R252
%R253 = load i32* %R250
%R254 = mul i32 %R253, %R251
store i32 %R254, i32* %R250
%R255 = load i32* %R250
%R247 = alloca i32, i32 %R255
%R257 = alloca i32, i32 1
%R258 = alloca i32
store i32 0, i32* %R258
%R259 = alloca i32
store i32 1, i32* %R259
%R260 = load i32* %R240
%R261 = getelementptr i32* %R257, i32 0
store i32 %R260, i32* %R261
%R262 = load i32* %R259
%R263 = mul i32 %R262, %R260
store i32 %R263, i32* %R259
%R264 = load i32* %R259
%R256 = alloca i32, i32 %R264
%R299 = add i32 0, 0
%R300 = load i32* %R240
%R266 = alloca i32
store i32 0, i32* %R266
%R265 = load i32* %R266
store i32 %R299, i32* %R266
br label %L6
L6:
%R301 = load i32* %R266
%R302 = icmp ne i32 %R300, %R301
br i1 %R302, label %L7, label %L8
L7:
%R267 = alloca i32
%R268 = load i32* %R250
store i32 %R268, i32* %R267
%R269 = alloca i32
store i32 0, i32* %R269
%R270 = load i32* %R266
%R271 = getelementptr i32* %R248, i32 0
%R275 = load i32* %R271
%R272 = add i32 0, %R270
%R273 = load i32* %R269
%R274 = add i32 %R273, %R272
store i32 %R274, i32* %R269
%R276 = load i32* %R267
%R277 = sdiv i32 %R276, %R275
store i32 %R277, i32* %R267
%R278 = add i32 0, 1
%R282 = load i32* %R269
%R281 = getelementptr i32* %R247, i32 %R282
store i32 %R278, i32* %R281
%R283 = alloca i32
%R284 = load i32* %R259
store i32 %R284, i32* %R283
%R285 = alloca i32
store i32 0, i32* %R285
%R286 = load i32* %R266
%R287 = getelementptr i32* %R257, i32 0
%R291 = load i32* %R287
%R288 = add i32 0, %R286
%R289 = load i32* %R285
%R290 = add i32 %R289, %R288
store i32 %R290, i32* %R285
%R292 = load i32* %R283
%R293 = sdiv i32 %R292, %R291
store i32 %R293, i32* %R283
%R294 = load i32* %R266
%R298 = load i32* %R285
%R297 = getelementptr i32* %R256, i32 %R298
store i32 %R294, i32* %R297
%R304 = load i32* %R266
%R303 = add i32 %R304, 1
store i32 %R303, i32* %R266
br label %L6
L8:
%R306 = add i32 0, 0
%R308 = alloca i32
store i32 0, i32* %R308
%R307 = load i32* %R308
%R309 = add i32 0, 1
store i32 %R309, i32* %R308
%R332 = add i32 0, 0
%R333 = load i32* %R244
%R312 = load i32* %R266
store i32 %R332, i32* %R266
br label %L9
L9:
%R334 = load i32* %R266
%R335 = icmp ne i32 %R333, %R334
br i1 %R335, label %L10, label %L11
L10:
%R314 = alloca i32
store i32 0, i32* %R314
%R313 = load i32* %R314
%R315 = call i32 @readInt()
store i32 %R315, i32* %R314
%R318 = alloca i32
store i32 0, i32* %R318
%R317 = load i32* %R318
%R319 = call i32 @readInt()
store i32 %R319, i32* %R318
%R321 = load i32* %R314
%R322 = load i32* %R318
%R323 = load i32* %R240
%R324 = load i32* %R244
%R325 = alloca i32
%R326 = load i32* %R259
store i32 %R326, i32* %R325
%R327 = alloca i32
store i32 0, i32* %R327
%R328 = alloca i32
%R329 = load i32* %R250
store i32 %R329, i32* %R328
%R330 = alloca i32
store i32 0, i32* %R330
%R331 = call i32 @union(i32 %R321, i32 %R322, i32 %R323, i32 %R324, i32* %R256, i32* %R247)
%R337 = load i32* %R266
%R336 = add i32 %R337, 1
store i32 %R336, i32* %R266
br label %L9
L11:
%R339 = add i32 0, 0
%R341 = alloca i32, i32 1
%R342 = alloca i32
store i32 0, i32* %R342
%R343 = alloca i32
store i32 1, i32* %R343
%R344 = add i32 0, 4
%R345 = getelementptr i32* %R341, i32 0
store i32 %R344, i32* %R345
%R346 = load i32* %R343
%R347 = mul i32 %R346, %R344
store i32 %R347, i32* %R343
%R348 = load i32* %R343
%R340 = alloca i32, i32 %R348
%R350 = alloca i32
store i32 0, i32* %R350
%R351 = alloca i32
store i32 4, i32* %R351
%R352 = load i32* %R351
%R349 = alloca i32, i32 %R352
%R353 = getelementptr i32* %R349, i32 0
store i32 65, i32* %R353
%R354 = getelementptr i32* %R349, i32 1
store i32 78, i32* %R354
%R355 = getelementptr i32* %R349, i32 2
store i32 79, i32* %R355
%R356 = getelementptr i32* %R349, i32 3
store i32 0, i32* %R356
%R360 = load i32* %R342
%R359 = getelementptr i32* %R340, i32 %R360
%R361 = load i32* %R350
%R358 = getelementptr i32* %R349, i32 %R361
%R362 = load i32* %R351
call void @arrcopy(i32* %R359, i32* %R358, i32 %R362)
%R364 = alloca i32
store i32 0, i32* %R364
%R363 = load i32* %R364
%R366 = alloca i32, i32 1
%R367 = alloca i32
store i32 0, i32* %R367
%R368 = alloca i32
store i32 1, i32* %R368
%R369 = add i32 0, 0
%R370 = getelementptr i32* %R366, i32 0
store i32 %R369, i32* %R370
%R371 = load i32* %R368
%R372 = mul i32 %R371, %R369
store i32 %R372, i32* %R368
%R373 = load i32* %R368
%R365 = alloca i32, i32 %R373
%R376 = load i32* %R367
%R375 = getelementptr i32* %R365, i32 %R376
%R377 = load i32* %R368
call void @arrcopy(i32* %R364, i32* %R375, i32 %R377)
%R378 = load i32* %R240
%R379 = add i32 0, 0
%R380 = icmp eq i32 %R378, %R379
%R381 = sext i1 %R380 to i32
%R441 = icmp ne i32 %R381, 0
br i1 %R441, label %L17, label %L18
L17:
%R382 = alloca i32
%R383 = load i32* %R343
store i32 %R383, i32* %R382
%R384 = alloca i32
store i32 0, i32* %R384
%R386 = alloca i32
store i32 0, i32* %R386
%R387 = alloca i32
store i32 4, i32* %R387
%R388 = load i32* %R387
%R385 = alloca i32, i32 %R388
%R389 = getelementptr i32* %R385, i32 0
store i32 78, i32* %R389
%R390 = getelementptr i32* %R385, i32 1
store i32 73, i32* %R390
%R391 = getelementptr i32* %R385, i32 2
store i32 69, i32* %R391
%R392 = getelementptr i32* %R385, i32 3
store i32 0, i32* %R392
%R396 = load i32* %R384
%R395 = getelementptr i32* %R340, i32 %R396
%R397 = load i32* %R386
%R394 = getelementptr i32* %R385, i32 %R397
%R398 = load i32* %R387
call void @arrcopy(i32* %R395, i32* %R394, i32 %R398)
br label %L19
L18:
%R433 = add i32 0, 0
%R434 = load i32* %R240
%R400 = load i32* %R266
store i32 %R433, i32* %R266
br label %L14
L14:
%R435 = load i32* %R266
%R436 = icmp ne i32 %R434, %R435
br i1 %R436, label %L15, label %L16
L15:
%R401 = load i32* %R266
%R402 = load i32* %R240
%R403 = load i32* %R244
%R404 = alloca i32
%R405 = load i32* %R259
store i32 %R405, i32* %R404
%R406 = alloca i32
store i32 0, i32* %R406
%R407 = alloca i32
%R408 = load i32* %R250
store i32 %R408, i32* %R407
%R409 = alloca i32
store i32 0, i32* %R409
%R410 = call i32 @find(i32 %R401, i32 %R402, i32 %R403, i32* %R256, i32* %R247)
%R411 = load i32* %R364
%R412 = icmp ne i32 %R410, %R411
%R413 = sext i1 %R412 to i32
%R432 = icmp ne i32 %R413, 0
br i1 %R432, label %L12, label %L13
L12:
%R414 = alloca i32
%R415 = load i32* %R343
store i32 %R415, i32* %R414
%R416 = alloca i32
store i32 0, i32* %R416
%R418 = alloca i32
store i32 0, i32* %R418
%R419 = alloca i32
store i32 4, i32* %R419
%R420 = load i32* %R419
%R417 = alloca i32, i32 %R420
%R421 = getelementptr i32* %R417, i32 0
store i32 78, i32* %R421
%R422 = getelementptr i32* %R417, i32 1
store i32 73, i32* %R422
%R423 = getelementptr i32* %R417, i32 2
store i32 69, i32* %R423
%R424 = getelementptr i32* %R417, i32 3
store i32 0, i32* %R424
%R428 = load i32* %R416
%R427 = getelementptr i32* %R340, i32 %R428
%R429 = load i32* %R418
%R426 = getelementptr i32* %R417, i32 %R429
%R430 = load i32* %R419
call void @arrcopy(i32* %R427, i32* %R426, i32 %R430)
br label %L13
L13:
%R431 = add i32 0, 0
%R438 = load i32* %R266
%R437 = add i32 %R438, 1
store i32 %R437, i32* %R266
br label %L14
L16:
%R440 = add i32 0, 0
br label %L19
L19:
%R399 = add i32 0, 0
%R442 = alloca i32
%R443 = load i32* %R343
store i32 %R443, i32* %R442
%R444 = alloca i32
store i32 0, i32* %R444
%R445 = load i32* %R442
%R446 = load i32* %R444
%R447 = getelementptr i32* %R340, i32 %R446
call void @printString(i32* %R447, i32 %R445)
call void @printLine()
ret i32 0
}
