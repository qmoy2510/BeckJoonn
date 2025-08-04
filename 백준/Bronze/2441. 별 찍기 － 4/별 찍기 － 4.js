const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString();

for(i=0; i<input; i++){
    for(j=0; j<i; j++){
        process.stdout.write(" ");
    }
    for(j=0; j<input-i; j++){
        process.stdout.write("*");
    }
    process.stdout.write("\n");
}