use crate::Solvable;
use num_bigint::BigUint;
use num_traits::One;
use std::collections::HashMap;

fn factorial(n: u64, cache: &mut HashMap<u64, BigUint>) -> BigUint {
    if n == 0 { return BigUint::one(); }
    if let Some(v) = cache.get(&n) { return v.clone(); }
    let prev = factorial(n - 1, cache);
    let result = BigUint::from(n) * prev;
    cache.insert(n, result.clone());
    result
}

pub struct P020;
impl Solvable for P020 {
    fn problem_name(&self) -> &str { "p020" }
    fn solve(&self) -> i64 {
        let mut cache = HashMap::new();
        factorial(100, &mut cache).to_string().bytes().map(|b| (b - b'0') as i64).sum()
    }
}
