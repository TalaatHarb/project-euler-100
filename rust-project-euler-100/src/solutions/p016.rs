use crate::Solvable;
use num_bigint::BigUint;

pub struct P016;
impl Solvable for P016 {
    fn problem_name(&self) -> &str { "p016" }
    fn solve(&self) -> i64 {
        let n = 1000u32;
        let power = BigUint::from(2u32).pow(n);
        power.to_string().bytes().map(|b| (b - b'0') as i64).sum()
    }
}
