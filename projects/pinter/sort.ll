declare void @arrcopy(i32*,i32*,i32)
declare i32 @readInt()
declare void @readString(i32*,i32)
declare void @printInt(i32)
declare void @printString(i32*,i32)
declare void @printIntSep(i32,i32*,i32)
declare void @printStringSep(i32*,i32,i32*,i32)
declare void @printLine()
define i32 @rekurz(i32 %R2, i32 %R7, i32 %R12, i32* %R24) {
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
%R19 = load i32* %R11
%R20 = getelementptr i32* %R16, i32 0
store i32 %R19, i32* %R20
%R21 = load i32* %R18
%R22 = mul i32 %R21, %R19
store i32 %R22, i32* %R18
%R23 = load i32* %R18
%R15 = alloca i32, i32 %R23
%R25 = load i32* %R6
%R26 = load i32* %R1
%R27 = sub i32 %R25, %R26
%R28 = add i32 0, 3
%R29 = icmp slt i32 %R27, %R28
%R30 = sext i1 %R29 to i32
%R133 = icmp ne i32 %R30, 0
br i1 %R133, label %L2, label %L3
L2:
%R31 = alloca i32
%R32 = load i32* %R18
store i32 %R32, i32* %R31
%R33 = alloca i32
store i32 0, i32* %R33
%R34 = load i32* %R1
%R35 = getelementptr i32* %R16, i32 0
%R39 = load i32* %R35
%R36 = add i32 0, %R34
%R37 = load i32* %R33
%R38 = add i32 %R37, %R36
store i32 %R38, i32* %R33
%R40 = load i32* %R31
%R41 = sdiv i32 %R40, %R39
store i32 %R41, i32* %R31
%R56 = load i32* %R33
%R55 = getelementptr i32* %R24, i32 %R56
%R57 = load i32* %R55
%R42 = alloca i32
%R43 = load i32* %R18
store i32 %R43, i32* %R42
%R44 = alloca i32
store i32 0, i32* %R44
%R45 = load i32* %R6
%R46 = add i32 0, 1
%R47 = sub i32 %R45, %R46
%R48 = getelementptr i32* %R16, i32 0
%R52 = load i32* %R48
%R49 = add i32 0, %R47
%R50 = load i32* %R44
%R51 = add i32 %R50, %R49
store i32 %R51, i32* %R44
%R53 = load i32* %R42
%R54 = sdiv i32 %R53, %R52
store i32 %R54, i32* %R42
%R59 = load i32* %R44
%R58 = getelementptr i32* %R24, i32 %R59
%R60 = load i32* %R58
%R61 = icmp sgt i32 %R57, %R60
%R62 = sext i1 %R61 to i32
%R130 = icmp ne i32 %R62, 0
br i1 %R130, label %L0, label %L1
L0:
%R64 = alloca i32
store i32 0, i32* %R64
%R63 = load i32* %R64
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
store i32 %R78, i32* %R64
%R81 = alloca i32
%R82 = load i32* %R18
store i32 %R82, i32* %R81
%R83 = alloca i32
store i32 0, i32* %R83
%R84 = load i32* %R1
%R85 = getelementptr i32* %R16, i32 0
%R89 = load i32* %R85
%R86 = add i32 0, %R84
%R87 = load i32* %R83
%R88 = add i32 %R87, %R86
store i32 %R88, i32* %R83
%R90 = load i32* %R81
%R91 = sdiv i32 %R90, %R89
store i32 %R91, i32* %R81
%R92 = alloca i32
%R93 = load i32* %R18
store i32 %R93, i32* %R92
%R94 = alloca i32
store i32 0, i32* %R94
%R95 = load i32* %R6
%R96 = add i32 0, 1
%R97 = sub i32 %R95, %R96
%R98 = getelementptr i32* %R16, i32 0
%R102 = load i32* %R98
%R99 = add i32 0, %R97
%R100 = load i32* %R94
%R101 = add i32 %R100, %R99
store i32 %R101, i32* %R94
%R103 = load i32* %R92
%R104 = sdiv i32 %R103, %R102
store i32 %R104, i32* %R92
%R108 = load i32* %R83
%R107 = getelementptr i32* %R24, i32 %R108
%R109 = load i32* %R94
%R106 = getelementptr i32* %R24, i32 %R109
%R110 = load i32* %R92
call void @arrcopy(i32* %R107, i32* %R106, i32 %R110)
%R111 = alloca i32
%R112 = load i32* %R18
store i32 %R112, i32* %R111
%R113 = alloca i32
store i32 0, i32* %R113
%R114 = load i32* %R6
%R115 = add i32 0, 1
%R116 = sub i32 %R114, %R115
%R117 = getelementptr i32* %R16, i32 0
%R121 = load i32* %R117
%R118 = add i32 0, %R116
%R119 = load i32* %R113
%R120 = add i32 %R119, %R118
store i32 %R120, i32* %R113
%R122 = load i32* %R111
%R123 = sdiv i32 %R122, %R121
store i32 %R123, i32* %R111
%R124 = load i32* %R64
%R128 = load i32* %R113
%R127 = getelementptr i32* %R24, i32 %R128
store i32 %R124, i32* %R127
br label %L1
L1:
%R129 = add i32 0, 0
%R131 = add i32 0, 0
ret i32 %R131
br label %L3
L3:
%R132 = add i32 0, 0
%R135 = alloca i32
store i32 0, i32* %R135
%R134 = load i32* %R135
%R136 = alloca i32
%R137 = load i32* %R18
store i32 %R137, i32* %R136
%R138 = alloca i32
store i32 0, i32* %R138
%R139 = load i32* %R6
%R140 = add i32 0, 1
%R141 = sub i32 %R139, %R140
%R142 = getelementptr i32* %R16, i32 0
%R146 = load i32* %R142
%R143 = add i32 0, %R141
%R144 = load i32* %R138
%R145 = add i32 %R144, %R143
store i32 %R145, i32* %R138
%R147 = load i32* %R136
%R148 = sdiv i32 %R147, %R146
store i32 %R148, i32* %R136
%R150 = load i32* %R138
%R149 = getelementptr i32* %R24, i32 %R150
%R151 = load i32* %R149
store i32 %R151, i32* %R135
%R155 = alloca i32
store i32 0, i32* %R155
%R154 = load i32* %R155
%R156 = load i32* %R6
%R157 = add i32 0, 2
%R158 = sub i32 %R156, %R157
store i32 %R158, i32* %R155
%R162 = alloca i32
store i32 0, i32* %R162
%R161 = load i32* %R162
%R163 = load i32* %R1
store i32 %R163, i32* %R162
br label %L7
L7:
%R166 = load i32* %R162
%R167 = load i32* %R155
%R168 = icmp slt i32 %R166, %R167
%R169 = sext i1 %R168 to i32
%R259 = icmp ne i32 %R169, 0
br i1 %R259, label %L8, label %L9
L8:
%R170 = alloca i32
%R171 = load i32* %R18
store i32 %R171, i32* %R170
%R172 = alloca i32
store i32 0, i32* %R172
%R173 = load i32* %R162
%R174 = getelementptr i32* %R16, i32 0
%R178 = load i32* %R174
%R175 = add i32 0, %R173
%R176 = load i32* %R172
%R177 = add i32 %R176, %R175
store i32 %R177, i32* %R172
%R179 = load i32* %R170
%R180 = sdiv i32 %R179, %R178
store i32 %R180, i32* %R170
%R183 = load i32* %R172
%R182 = getelementptr i32* %R24, i32 %R183
%R184 = load i32* %R182
%R181 = load i32* %R135
%R185 = icmp sgt i32 %R184, %R181
%R186 = sext i1 %R185 to i32
%R258 = icmp ne i32 %R186, 0
br i1 %R258, label %L4, label %L5
L4:
%R188 = alloca i32
store i32 0, i32* %R188
%R187 = load i32* %R188
%R189 = alloca i32
%R190 = load i32* %R18
store i32 %R190, i32* %R189
%R191 = alloca i32
store i32 0, i32* %R191
%R192 = load i32* %R162
%R193 = getelementptr i32* %R16, i32 0
%R197 = load i32* %R193
%R194 = add i32 0, %R192
%R195 = load i32* %R191
%R196 = add i32 %R195, %R194
store i32 %R196, i32* %R191
%R198 = load i32* %R189
%R199 = sdiv i32 %R198, %R197
store i32 %R199, i32* %R189
%R201 = load i32* %R191
%R200 = getelementptr i32* %R24, i32 %R201
%R202 = load i32* %R200
store i32 %R202, i32* %R188
%R205 = alloca i32
%R206 = load i32* %R18
store i32 %R206, i32* %R205
%R207 = alloca i32
store i32 0, i32* %R207
%R208 = load i32* %R162
%R209 = getelementptr i32* %R16, i32 0
%R213 = load i32* %R209
%R210 = add i32 0, %R208
%R211 = load i32* %R207
%R212 = add i32 %R211, %R210
store i32 %R212, i32* %R207
%R214 = load i32* %R205
%R215 = sdiv i32 %R214, %R213
store i32 %R215, i32* %R205
%R216 = alloca i32
%R217 = load i32* %R18
store i32 %R217, i32* %R216
%R218 = alloca i32
store i32 0, i32* %R218
%R219 = load i32* %R155
%R220 = getelementptr i32* %R16, i32 0
%R224 = load i32* %R220
%R221 = add i32 0, %R219
%R222 = load i32* %R218
%R223 = add i32 %R222, %R221
store i32 %R223, i32* %R218
%R225 = load i32* %R216
%R226 = sdiv i32 %R225, %R224
store i32 %R226, i32* %R216
%R230 = load i32* %R207
%R229 = getelementptr i32* %R24, i32 %R230
%R231 = load i32* %R218
%R228 = getelementptr i32* %R24, i32 %R231
%R232 = load i32* %R216
call void @arrcopy(i32* %R229, i32* %R228, i32 %R232)
%R233 = alloca i32
%R234 = load i32* %R18
store i32 %R234, i32* %R233
%R235 = alloca i32
store i32 0, i32* %R235
%R236 = load i32* %R155
%R237 = getelementptr i32* %R16, i32 0
%R241 = load i32* %R237
%R238 = add i32 0, %R236
%R239 = load i32* %R235
%R240 = add i32 %R239, %R238
store i32 %R240, i32* %R235
%R242 = load i32* %R233
%R243 = sdiv i32 %R242, %R241
store i32 %R243, i32* %R233
%R244 = load i32* %R188
%R248 = load i32* %R235
%R247 = getelementptr i32* %R24, i32 %R248
store i32 %R244, i32* %R247
%R249 = load i32* %R155
%R250 = add i32 0, 1
%R251 = sub i32 %R249, %R250
store i32 %R251, i32* %R155
br label %L6
L5:
%R254 = load i32* %R162
%R255 = add i32 0, 1
%R256 = add i32 %R254, %R255
store i32 %R256, i32* %R162
br label %L6
L6:
%R253 = add i32 0, 0
br label %L7
L9:
%R260 = add i32 0, 0
%R261 = alloca i32
%R262 = load i32* %R18
store i32 %R262, i32* %R261
%R263 = alloca i32
store i32 0, i32* %R263
%R264 = load i32* %R162
%R265 = getelementptr i32* %R16, i32 0
%R269 = load i32* %R265
%R266 = add i32 0, %R264
%R267 = load i32* %R263
%R268 = add i32 %R267, %R266
store i32 %R268, i32* %R263
%R270 = load i32* %R261
%R271 = sdiv i32 %R270, %R269
store i32 %R271, i32* %R261
%R274 = load i32* %R263
%R273 = getelementptr i32* %R24, i32 %R274
%R275 = load i32* %R273
%R272 = load i32* %R135
%R276 = icmp sgt i32 %R275, %R272
%R277 = sext i1 %R276 to i32
%R331 = icmp ne i32 %R277, 0
br i1 %R331, label %L10, label %L11
L10:
%R279 = alloca i32
store i32 0, i32* %R279
%R278 = load i32* %R279
%R280 = alloca i32
%R281 = load i32* %R18
store i32 %R281, i32* %R280
%R282 = alloca i32
store i32 0, i32* %R282
%R283 = load i32* %R162
%R284 = getelementptr i32* %R16, i32 0
%R288 = load i32* %R284
%R285 = add i32 0, %R283
%R286 = load i32* %R282
%R287 = add i32 %R286, %R285
store i32 %R287, i32* %R282
%R289 = load i32* %R280
%R290 = sdiv i32 %R289, %R288
store i32 %R290, i32* %R280
%R292 = load i32* %R282
%R291 = getelementptr i32* %R24, i32 %R292
%R293 = load i32* %R291
store i32 %R293, i32* %R279
%R296 = alloca i32
%R297 = load i32* %R18
store i32 %R297, i32* %R296
%R298 = alloca i32
store i32 0, i32* %R298
%R299 = load i32* %R162
%R300 = getelementptr i32* %R16, i32 0
%R304 = load i32* %R300
%R301 = add i32 0, %R299
%R302 = load i32* %R298
%R303 = add i32 %R302, %R301
store i32 %R303, i32* %R298
%R305 = load i32* %R296
%R306 = sdiv i32 %R305, %R304
store i32 %R306, i32* %R296
%R307 = load i32* %R135
%R311 = load i32* %R298
%R310 = getelementptr i32* %R24, i32 %R311
store i32 %R307, i32* %R310
%R312 = alloca i32
%R313 = load i32* %R18
store i32 %R313, i32* %R312
%R314 = alloca i32
store i32 0, i32* %R314
%R315 = load i32* %R6
%R316 = add i32 0, 1
%R317 = sub i32 %R315, %R316
%R318 = getelementptr i32* %R16, i32 0
%R322 = load i32* %R318
%R319 = add i32 0, %R317
%R320 = load i32* %R314
%R321 = add i32 %R320, %R319
store i32 %R321, i32* %R314
%R323 = load i32* %R312
%R324 = sdiv i32 %R323, %R322
store i32 %R324, i32* %R312
%R325 = load i32* %R279
%R329 = load i32* %R314
%R328 = getelementptr i32* %R24, i32 %R329
store i32 %R325, i32* %R328
br label %L11
L11:
%R330 = add i32 0, 0
%R333 = alloca i32
store i32 0, i32* %R333
%R334 = alloca i32
store i32 6, i32* %R334
%R335 = load i32* %R334
%R332 = alloca i32, i32 %R335
%R336 = getelementptr i32* %R332, i32 0
store i32 118, i32* %R336
%R337 = getelementptr i32* %R332, i32 1
store i32 121, i32* %R337
%R338 = getelementptr i32* %R332, i32 2
store i32 112, i32* %R338
%R339 = getelementptr i32* %R332, i32 3
store i32 105, i32* %R339
%R340 = getelementptr i32* %R332, i32 4
store i32 115, i32* %R340
%R341 = getelementptr i32* %R332, i32 5
store i32 0, i32* %R341
%R342 = load i32* %R334
%R343 = load i32* %R333
%R344 = getelementptr i32* %R332, i32 %R343
call void @printString(i32* %R344, i32 %R342)
call void @printLine()
%R361 = load i32* %R1
%R362 = load i32* %R6
%R346 = alloca i32
store i32 0, i32* %R346
%R345 = load i32* %R346
store i32 %R361, i32* %R346
br label %L12
L12:
%R363 = load i32* %R346
%R364 = icmp ne i32 %R362, %R363
br i1 %R364, label %L13, label %L14
L13:
%R347 = alloca i32
%R348 = load i32* %R18
store i32 %R348, i32* %R347
%R349 = alloca i32
store i32 0, i32* %R349
%R350 = load i32* %R346
%R351 = getelementptr i32* %R16, i32 0
%R355 = load i32* %R351
%R352 = add i32 0, %R350
%R353 = load i32* %R349
%R354 = add i32 %R353, %R352
store i32 %R354, i32* %R349
%R356 = load i32* %R347
%R357 = sdiv i32 %R356, %R355
store i32 %R357, i32* %R347
%R359 = load i32* %R349
%R358 = getelementptr i32* %R24, i32 %R359
%R360 = load i32* %R358
call void @printInt(i32 %R360)
call void @printLine()
%R366 = load i32* %R346
%R365 = add i32 %R366, 1
store i32 %R365, i32* %R346
br label %L12
L14:
%R368 = add i32 0, 0
%R369 = load i32* %R1
%R370 = load i32* %R162
%R371 = load i32* %R11
%R372 = alloca i32
%R373 = load i32* %R18
store i32 %R373, i32* %R372
%R374 = alloca i32
store i32 0, i32* %R374
%R375 = call i32 @rekurz(i32 %R369, i32 %R370, i32 %R371, i32* %R24)
%R376 = load i32* %R162
%R377 = load i32* %R6
%R378 = load i32* %R11
%R379 = alloca i32
%R380 = load i32* %R18
store i32 %R380, i32* %R379
%R381 = alloca i32
store i32 0, i32* %R381
%R382 = call i32 @rekurz(i32 %R376, i32 %R377, i32 %R378, i32* %R24)
ret i32 0
}
define i32 @main() {
start:
%R384 = alloca i32
store i32 0, i32* %R384
%R383 = load i32* %R384
%R385 = call i32 @readInt()
store i32 %R385, i32* %R384
%R388 = alloca i32, i32 1
%R389 = alloca i32
store i32 0, i32* %R389
%R390 = alloca i32
store i32 1, i32* %R390
%R391 = load i32* %R384
%R392 = getelementptr i32* %R388, i32 0
store i32 %R391, i32* %R392
%R393 = load i32* %R390
%R394 = mul i32 %R393, %R391
store i32 %R394, i32* %R390
%R395 = load i32* %R390
%R387 = alloca i32, i32 %R395
%R413 = add i32 0, 0
%R414 = load i32* %R384
%R397 = alloca i32
store i32 0, i32* %R397
%R396 = load i32* %R397
store i32 %R413, i32* %R397
br label %L15
L15:
%R415 = load i32* %R397
%R416 = icmp ne i32 %R414, %R415
br i1 %R416, label %L16, label %L17
L16:
%R398 = alloca i32
%R399 = load i32* %R390
store i32 %R399, i32* %R398
%R400 = alloca i32
store i32 0, i32* %R400
%R401 = load i32* %R397
%R402 = getelementptr i32* %R388, i32 0
%R406 = load i32* %R402
%R403 = add i32 0, %R401
%R404 = load i32* %R400
%R405 = add i32 %R404, %R403
store i32 %R405, i32* %R400
%R407 = load i32* %R398
%R408 = sdiv i32 %R407, %R406
store i32 %R408, i32* %R398
%R409 = call i32 @readInt()
%R412 = load i32* %R400
%R411 = getelementptr i32* %R387, i32 %R412
store i32 %R409, i32* %R411
%R418 = load i32* %R397
%R417 = add i32 %R418, 1
store i32 %R417, i32* %R397
br label %L15
L17:
%R420 = add i32 0, 0
%R421 = add i32 0, 0
%R422 = load i32* %R384
%R423 = load i32* %R384
%R424 = alloca i32
%R425 = load i32* %R390
store i32 %R425, i32* %R424
%R426 = alloca i32
store i32 0, i32* %R426
%R427 = call i32 @rekurz(i32 %R421, i32 %R422, i32 %R423, i32* %R387)
%R443 = add i32 0, 0
%R444 = load i32* %R384
%R428 = load i32* %R397
store i32 %R443, i32* %R397
br label %L18
L18:
%R445 = load i32* %R397
%R446 = icmp ne i32 %R444, %R445
br i1 %R446, label %L19, label %L20
L19:
%R429 = alloca i32
%R430 = load i32* %R390
store i32 %R430, i32* %R429
%R431 = alloca i32
store i32 0, i32* %R431
%R432 = load i32* %R397
%R433 = getelementptr i32* %R388, i32 0
%R437 = load i32* %R433
%R434 = add i32 0, %R432
%R435 = load i32* %R431
%R436 = add i32 %R435, %R434
store i32 %R436, i32* %R431
%R438 = load i32* %R429
%R439 = sdiv i32 %R438, %R437
store i32 %R439, i32* %R429
%R441 = load i32* %R431
%R440 = getelementptr i32* %R387, i32 %R441
%R442 = load i32* %R440
call void @printInt(i32 %R442)
call void @printLine()
%R448 = load i32* %R397
%R447 = add i32 %R448, 1
store i32 %R447, i32* %R397
br label %L18
L20:
%R450 = add i32 0, 0
ret i32 0
}
