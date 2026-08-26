use crate::Solvable;
use num_bigint::BigUint;
use num_traits::One;
use std::collections::HashMap;

fn fib(n: u64, cache: &mut HashMap<u64, BigUint>) -> BigUint {
    if n <= 2 { return BigUint::one(); }
    if let Some(v) = cache.get(&n) { return v.clone(); }
    let a = fib(n - 1, cache);
    let b = fib(n - 2, cache);
    let result = a + b;
    cache.insert(n, result.clone());
    result
}

pub struct P025;
impl Solvable for P025 {
    fn problem_name(&self) -> &str { "p025" }
    fn solve(&self) -> i64 {
        let target = 1000;
        let mut cache = HashMap::new();
        let mut i = 3u64;
        while fib(i, &mut cache).to_string().len() < target {
            i += 1;
        }
        i as i64
    }
}
