var numbers = {
	// ..
	*[Symbol.iterator]({
		start = 0,
		stop = 100,
		steps = 1
	} = {}){
		for(let num = start; num <= stop; num += steps){
			yield num;
		}
	}
};

// should print 0..100 by 1s
for (let num of numbers) {
	console.log(num);
}

// should print 6..30 by 4s
console.log(`My lucky numbers are: ${[...numbers[Symbol.iterator](
	{
		start: 6,
		stop: 30,
		steps: 4
	}
)]}`);

// Hint:
//     [...numbers[Symbol.iterator]( ?? )]
