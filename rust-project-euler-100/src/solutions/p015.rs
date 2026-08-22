use crate::{Runable, Solvable};
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

pub struct P015;
impl Solvable for P015 {
    fn problem_name(&self) -> &str { "p015" }
    fn solve(&self) -> i64 {
        let n = 20u64;
        let mut cache = HashMap::new();
        let num = factorial(2 * n, &mut cache);
        let den = factorial(n, &mut cache).pow(2);
        (num / den).try_into().unwrap()
    }
}
impl Runable for P015 {}
