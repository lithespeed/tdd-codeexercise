function wordWrapper(line, length) {
    if (line.length <= length || length <= 0) return line;
    var split = line.split('');
    var result = [];
    while (split.length > 0) {
        result.push(split.splice(0, length).join(''));
    }
    return result.join('\n');
}