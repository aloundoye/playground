function upper(strings,...values) {
	return strings[0] + values[0].toUpperCase() +
	strings[1] + values[1].toUpperCase() +
	strings[2] + values[2].toUpperCase() + strings[3];
}

var name = "kyle",
	twitter = "getify",
	topic = "JS Recent Parts";

console.log(
	upper`Hello ${name} (@${twitter}), welcome to ${topic}!` ===
	"Hello KYLE (@GETIFY), welcome to JS RECENT PARTS!"
);
