const fs = require('fs');
const input = fs.readFileSync("/dev/stdin").toString();

for(i=1; i<=input; i++){
    for(j=0; j<input-i+1; j++){
        process.stdout.write("*");
    }
    process.stdout.write("\n");
}