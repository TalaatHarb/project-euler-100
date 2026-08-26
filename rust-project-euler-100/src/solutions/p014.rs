use crate::Solvable;
use std::collections::HashMap;

fn collatz(n: u64, cache: &mut HashMap<u64, u64>) -> u64 {
    if n == 1 { return 0; }
    if let Some(&v) = cache.get(&n) { return v; }
    let next = if n % 2 == 0 { n / 2 } else { 3 * n + 1 };
    let result = collatz(next, cache) + 1;
    cache.insert(n, result);
    result
}

pub struct P014;
impl Solvable for P014 {
    fn problem_name(&self) -> &str { "p014" }
    fn solve(&self) -> i64 {
        let last = 1_000_000u64;
        let mut cache = HashMap::new();
        cache.insert(1u64, 0u64);
        let mut max_number = 1u64;
        let mut max_length = 0u64;
        for i in 2..last {
            let len = collatz(i, &mut cache);
            if len > max_length {
                max_length = len;
                max_number = i;
            }
        }
        max_number as i64
    }
}
